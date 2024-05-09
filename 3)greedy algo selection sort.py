def selection_sort(arr):
    n = len(arr)

    for i in range(n):
        # Find the minimum element in the unsorted part of the array
        min_index = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j

        # Swap the found minimum element with the first element
        arr[i], arr[min_index] = arr[min_index], arr[i]

    return arr

# Get dynamic input from the user
try:
    # Python 2.x
    user_input = raw_input("Enter numbers separated by space: ")
except NameError:
    # Python 3.x
    user_input = input("Enter numbers separated by space: ")

# Convert the input string to a list of integers
my_list = list(map(int, user_input.split()))

# Perform Selection Sort on the input list
sorted_list = selection_sort(my_list)

# Display the sorted list
print("Sorted list:", sorted_list)
