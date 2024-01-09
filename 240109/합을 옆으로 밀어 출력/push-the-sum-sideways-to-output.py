n = int(input())
tal = 0 
for i in range(n):
    tal+=int(input())
tal = str(tal)

tal = tal[1:] + tal[0]
print(tal)