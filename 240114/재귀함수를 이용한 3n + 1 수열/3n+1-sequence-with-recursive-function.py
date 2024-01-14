n = int(input())
cnt = 0
def val(num):
    global cnt
    if num == 1:
        return cnt
    
    if num%2==1:
        return val(num*3+1)
    else:
        return val(num//2)