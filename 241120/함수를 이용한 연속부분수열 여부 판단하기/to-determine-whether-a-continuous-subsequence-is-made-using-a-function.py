n, m = map(int,input().split())
num1 = list(map(int,input().split()))
num2 = list(map(int,input().split()))

def same(num1,num2):
    for i in range(m):
        if num1[i:i+m] == num2[:]:
            return True
    return False
if(same(num1,num2)):
    print("Yes")
else:
    print("No")