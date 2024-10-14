alpha = input()
f = ["apple","banana","grape","blueberry","orange"]

total = 0 

for i in f:
    if i[2] == alpha or i[3]== alpha:
        total+=1 
        print(i)