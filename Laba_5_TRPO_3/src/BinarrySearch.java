public class BinarrySearch
{
    double searchedNumber;
    int bottom = 0;
    int middle;
    int top;
    double[] _array;
    public BinarrySearch(double[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - i - 1; j++)
            {
                if(array[j + 1] < array[j])
                {
                    double swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        _array = array;
        top = _array.length;
    }

    public double serachElement(double number)
    {
        bottom = bottom -1;
        while ((bottom <= top))
        {
            middle = bottom + (top - bottom)/2;
            if (_array[middle] < number)
            {
                bottom = middle + 1;
            }
            else if(_array[middle] > number)
            {
                top = middle - 1;
            }
            else if (_array[middle] == number)
            {
                return  middle;
            }
        }
        return  -1;
    }
}
