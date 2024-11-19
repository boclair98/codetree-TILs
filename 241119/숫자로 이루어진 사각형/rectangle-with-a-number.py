n = int(input())

def square(num):
    cnt = 1 

    for i in range(num):
        for j in range(num):
            if cnt == 10 :
                cnt = 1
            print(cnt,end=" ")
            cnt+=1
        print()

square(n)