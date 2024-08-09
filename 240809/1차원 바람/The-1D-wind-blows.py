n, m, q = map(int,input().split())
num = [list(map(int,input().split())) for _ in range(n)]

#
def up_compare(num,k):
    for i in range(m):
        if num[k][i] == num[k-1][i]:
            return True 
    return False 

def down_compare(num,k):
    for i in range(m):
        if num[k][i] == num[k+1][i]:
            return True 
    return False 

def right(num,k):
    temp = num[k][-1]
    for i in range(m-1,0,-1):
        num[k][i] = num[k][i-1]
    num[k][0] = temp
    return num 

def left(num,k):
    temp = num[k][0]
    for i in range(m-1):
        num[k][i] = num[k][i+1]
    num[k][-1] = temp 
    return num 


for _ in range(q):
    sn,ver = map(str,input().split())
    sn = int(sn) - 1
    k = sn 
    if ver == 'L':
        cnt = 1
        fir = right(num,k)
        
        while k > 0:
            gal = up_compare(fir,k)
            k = k -1
            if gal:
                if cnt % 2 == 1:
                    
                    fir = left(fir,k)
                else:
                    
                    fir = right(fir,k)
                cnt+=1
            else:
                break 
        
        k = sn
        cnt = 1  
        while k < n-1:
            gal = down_compare(fir,k)
            if gal:
                if cnt % 2 == 1:
                    k = k + 1
                    fir = left(fir,k)
                else:
                    k = k + 1
                    fir = right(fir,k)
                cnt+=1
            else:
                break

    elif ver =='R':
        cnt = 2
        fir = left(num,k)
        while k > 0:
            gal = up_compare(fir,k)
            k = k -1
            if gal:
                if cnt % 2 == 1:
                    
                    fir = left(fir,k)
                else:
                    
                    fir = right(fir,k)
                cnt+=1
            else:
                break 
        
        k = sn
        cnt = 2  
        while k < n-1:
            gal = down_compare(fir,k)
            if gal:
                if cnt % 2 == 1:
                    k = k + 1
                    fir = left(fir,k)
                else:
                    k = k + 1
                    fir = right(fir,k)
                cnt+=1
            else:
                break


for i in range(n):
    for j in range(m):
        print(num[i][j],end=' ')
    print()

                


        
        #위쪽