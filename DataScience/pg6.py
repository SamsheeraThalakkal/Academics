from collections import Counter
from sklearn.datasets import load_iris
import math

# Function to calculate Euclidean distance
def distance(p1, p2):
    dist = 0
    for i in range(len(p1)):
        dist += (p1[i] - p2[i]) ** 2
    return math.sqrt(dist)

# KNN prediction function
def knn_predict(X_train, y_train, test_point, k=5):
    dist_list = []
    for i in range(len(X_train)):
        d = distance(X_train[i], test_point)
        dist_list.append((d, y_train[i]))

    # Sort by distance
    sorted_dist = sorted(dist_list, key=lambda x: x[0])

    # Take k nearest labels
    labels = [label for (_, label) in sorted_dist[:k]]

    # Count which label appears most
    counts = dict(Counter(labels))
    return max(counts, key=counts.get)

# Load the Iris dataset
iris = load_iris()

# Take input from user
inp = list(map(float, input("Enter sepal length, sepal width, petal length, petal width: ").split(',')))

# Predict using KNN
pred = knn_predict(iris.data, iris.target, inp, k=5)

# Print the predicted species
print("Predicted species:", iris.target_names[pred])
