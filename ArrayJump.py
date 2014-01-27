def solution(input_array):
    current = 0
    jumps = 0

    while current >= 0 and current < len(input_array):
        if input_array[current] is not None:
            next = current + input_array[current]
            input_array[current] = None #mark current position as visited
            current = next
            jumps += 1
        else: #loop discovered
            return -1

    return jumps
