# Bubble Sort

arr = [15, 3, 6, 46, 34, 234, 33, 1]

for x in range(0, len(arr)):
    for j in range(0, len(arr) - x - 1):
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]

for i in range(len(arr)):
    print(arr[i])


