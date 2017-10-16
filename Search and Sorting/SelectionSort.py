# Selection Sort

arr = [15, 3, 6, 46, 34, 234, 33, 1]

for i in range(len(arr)-1):
    lowest = i
    for j in range(i+1, len(arr)):
        if arr[j] < arr[lowest]:
            lowest = j
    temp = arr[lowest]
    arr[lowest] = arr[i]
    arr[i] = temp

for i in range(len(arr)):
    print(arr[i])
    