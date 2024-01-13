n = int(input())

def fibonaci(num):
    if num == 1:
        return 1
    if num == 2:
        return 1

    return fibonaci(num-1) + fibonaci(num-2)
print(fibonaci(n))