n = int(input())
word = []
val =  0
tal = 0 
for i in range(n):
    word.append(input())
    tal = len(word[i]) + tal

for j in range(n):

    for k in range(len(word[j])):
        if word[j][k] =='a':
            val+=1
print(tal,val)