n = int(input())
num = list(map(int,input().split()))


def recu(idx):
    if idx == 0:
        return num[idx]
    
    return max(recu(idx - 1),num[idx])
print(recu(n-1))