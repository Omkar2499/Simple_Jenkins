arr=[1,2,4,7,99]


def maximum(arr):
    for i in range(0,len(arr)):
        maxi=arr[0]
        if maxi>arr[i]:
            maxi=arr[i]
        
        return maxi
    

print(maximum(arr))

