int majorityElement(int* arr, int n)
{
    int v=arr[0];
    int vc=1;
    for(int i=1;i<n;i++)
    {
        if(arr[i]==v)
        ++ vc;
        else 
        -- vc;
        if(vc==0)
        {
            v=arr[i];
            vc=1;
        }
    }
    return v;
}
