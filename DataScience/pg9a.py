import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
import numpy as np

# Given data
car_age = [5,7,8,7,2,17,2,9,4,11,12,9,6]
car_speed = [99,86,87,88,111,86,103,87,94,78,77,85,86]

# Convert to numpy arrays and reshape for sklearn
X = np.array(car_age).reshape(-1, 1)
y = np.array(car_speed)

# Create and train the model
model = LinearRegression()
model.fit(X, y)

# Predict values for drawing line
y_pred = model.predict(X)

# (i) Draw the regression line
plt.scatter(car_age, car_speed, color='blue', label='Actual data')
plt.plot(car_age, y_pred, color='red', label='Regression line')
plt.xlabel("Car Age (years)")
plt.ylabel("Car Speed (km/h)")
plt.title("Linear Regression: Car Age vs Speed")
plt.legend()
plt.show()

# (ii) Predict car speed for age 14
pred_speed = model.predict([[14]])
print(f"Predicted car speed for age 14 years: {pred_speed[0]:.2f} km/h")
