a, b, c = map(int,input().split())

def max_val(num):
    if num < 10:
        return num
    
    tal = num % 10 
    return tal + max_val(num//10)

print(max_val(a*b*c))