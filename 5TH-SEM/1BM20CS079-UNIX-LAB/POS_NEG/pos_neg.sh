echo "\n---------------Pos Neg Zero---------------\n"

echo "Enter the number : "
read num

if [ $num -gt 0 ]
then
    echo "$num is positive"
elif [ $num -lt 0 ]
then
    echo "$num is negative"
else
    echo "$num is zero"
fi