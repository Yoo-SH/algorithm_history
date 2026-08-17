import sys
import re
def solution():
    
    for line in sys.stdin:
        line = line.rstrip()
        while True:
            new_line = re.sub(r'BUG', '', line)
            if new_line == line:
                break
            line = new_line

        print(line)
    
solution()