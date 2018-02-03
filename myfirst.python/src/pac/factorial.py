fact = 1
num = 4
if (num <0):
    print("there is no factorial for negative numbers")
elif(num == 0):
    print ("factorial of  0 : 1")
else:
    for i in range (1,num + 1):
        fact = fact * i
    print (fact)