max_val = 0 
min_val = 21
for _ in range(3):
    name = input()
    if len(name)>max_val:
        max_val = len(name)
    
    if len(name) < min_val:
        min_val = len(name)
print(max_val - min_val)