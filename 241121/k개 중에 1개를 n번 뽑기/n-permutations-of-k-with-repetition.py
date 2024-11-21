k, n = map(int,input().split())
visited =[False] * (k+1)
tal = [] 

def recu():
    if len(tal) ==  n :
        print(" ".join(map(str,tal)))
        return
    
    for i in range(1,k+1):
            tal.append(i)
            recu()
            tal.pop()
            
recu()