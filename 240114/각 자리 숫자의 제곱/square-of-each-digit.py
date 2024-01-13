n = int(input())

def gom(num):
    if num <10:
        return num * num
    tal = num % 10
    return gom(num // 10) + tal*tal


print(gom(n))