# Binary Search
# The function takes array start end and element to find
def binary_search(arr, l, r, x):
    if r >= 1:
        mid = 1 + (r-l)//2

        if arr[mid] == x:
            return mid
        elif x > arr[mid]:
            return binary_search(arr, mid, r, x)
        else:
            return binary_search(arr, 0, mid, x)

    else:
        return -1

arr = [2, 3, 4, 10, 40]
x = 10
result = binary_search(arr, 0, len(arr) - 1, x)

if result != -1:
    print("Element is present at index %d" % result)
else:
    print("Element is not present in array")


