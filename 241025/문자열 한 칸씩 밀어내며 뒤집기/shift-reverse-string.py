word,n = map(str,input().split())
n = int(n)

count = 0 

while count < n : 
    number = int(input())
    if number == 1:
        word = word[1:len(word)] + word[0]
    elif number == 2:
        word = word[-1] + word[0:len(word)-1]
    elif number == 3:
        word = word[::-1]
    count+=1
    print(word)