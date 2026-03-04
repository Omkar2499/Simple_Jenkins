def arr=[1,2,3,4,5,6,4,3,2,1]


def sorting(arr){
    for(int i=0;i<arr.size();i++){
    for(int j=i+1;j<arr.size();j++){
        if(arr[i]<arr[j]){
            int temp=arr[i]
            arr[i]=arr[j]
            arr[j]=temp
        }
    }
}
return arr


}

def maximum(arr){
    def maxi=arr[0]
    for(int i=0;i<arr.size();i++){
        if(arr[i]>maxi){
            maxi=arr[i]
        }

    }

    return maxi
}


println sorting(arr)
println maximum(arr)