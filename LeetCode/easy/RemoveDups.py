arr = [1,1,2,2,3,5,7,9]

L =1
for R in range(1, len(arr)):

    if arr[R] != arr[R-1]:
        arr[L] = arr[R]
        L +=1

for i in range(L, len(arr)):
    arr[i] = "_"

print(arr)
