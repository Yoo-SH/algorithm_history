from collections import defaultdict

def preorder(binary_tree,start_node):

    if start_node == '.':
        return
    
    left_node, right_node = binary_tree[start_node]
    
    print(start_node, end='')
    preorder(binary_tree, left_node)
    preorder(binary_tree, right_node)


def middleorder(binary_tree,start_node):
    if start_node == '.':
        return
    
    left_node, right_node = binary_tree[start_node]
    
    middleorder(binary_tree, left_node)
    print(start_node, end='')
    middleorder(binary_tree, right_node)


def postorder(binary_tree,start_node):
    if start_node == '.':
        return
    
    left_node, right_node = binary_tree[start_node]
    
    postorder(binary_tree, left_node)
    postorder(binary_tree, right_node)
    print(start_node, end='')


def solution():
    binary_tree = defaultdict(tuple)

    N = int(input().strip())
    for _ in range(N):
        p_node, c_r_node, c_l_node = map(str,input().split())
        binary_tree[p_node] = (c_r_node, c_l_node)
    
    preorder(binary_tree,'A')
    print(end="\n")
    middleorder(binary_tree,'A')
    print(end="\n")
    postorder(binary_tree,'A')
    
solution()