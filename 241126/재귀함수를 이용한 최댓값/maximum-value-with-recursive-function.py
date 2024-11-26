n = int(input())
number = list(map(int,input().split()))
def max_number(numbers):
    if numbers == 0:
        return number[numbers]
    
    return max(max_number(numbers-1), number[numbers])

print(max_number(n-1))