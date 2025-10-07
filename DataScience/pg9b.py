import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
import numpy as np

# Given data
age = [18, 22, 30, 45, 65, 80]
accident_no = [38, 36, 24, 20, 18, 28]

# Reshape data
X = np.array(age).reshape(-1, 1)
y = np.array(accident_no)

# Create and fit model
model = LinearRegression()
model.fit(X, y)

# Predict for plotting
y_pred = model.predict(X)

# (i) Plot the regression line
plt.scatter(age, accident_no, color='blue', label='Actual data')
plt.plot(age, y_pred, color='red', label='Regression line')
plt.xlabel("Driver Age")
plt.ylabel("No. of Accidents")
plt.title("Simple Linear Regression: Age vs Accidents")
plt.legend()
plt.show()

# (ii) Predict for age 40 and 60
pred_40 = model.predict([[40]])
pred_60 = model.predict([[60]])

print(f"Predicted number of accidents at age 40: {pred_40[0]:.2f}")
print(f"Predicted number of accidents at age 60: {pred_60[0]:.2f}")
