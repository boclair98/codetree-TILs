n = input()
length = len(n)
count = 0 
while True:
    if count == length:
        print(n)
        break
    
    print(n)
    n = n[-1] + n[0:length-1]
    count+=1