import numpy as np 
from sklearn import linear_model 

input = r'data.txt'
input_data = np.loadtxt(input, delimiter=",", skiprows=1) 
X, y = input_data[:, :-1], input_data[:, -1] 
training_samples = int((75/100) * len(X)) 
X_train, y_train = X[:training_samples], y[:training_samples] 
X_test, y_test = X[training_samples:], y[training_samples:] 
reg_linear = linear_model.LinearRegression() 
reg_linear.fit(X_train, y_train) 
print(reg_linear.coef_) 
print(reg_linear.intercept_) 
result = reg_linear.predict(X_test) 
 
print(result) 
