#myfile = open('open.txt')
#mytext = myfile.read()
#myfile.read()
import os
print(os.getcwd())
#os.chdir(r'C:\Users\namburu\workspace\mysecond.python\src')
#print (os.getcwd())
path = os.getcwd()
files = os.listdir(path)
for name in files :
    print (name)
    