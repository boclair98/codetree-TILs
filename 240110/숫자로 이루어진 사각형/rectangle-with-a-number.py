n = int(input())

def cro(a):
    cnt = 1
    for i in range(a):
        for j in range(a):
            if cnt == 10:
                cnt = 1
            print(cnt,end=' ')
            cnt+=1
        print()
cro(n)