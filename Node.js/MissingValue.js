let arr = [23,25,29,28,22,24,27,26,21];
    
max = 30;
missingValue = [];

    for(let i=21; i<=max;i++)
    {
        if(arr.indexOf(i) == -1)
            {
                missingValue.push(i)
            }
    }
    console.log("Missing Value of the array is : " + missingValue);


    
