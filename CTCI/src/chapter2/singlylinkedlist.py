class Node(object):
	"""docstring for Node"""
	def __init__(self, data, next = None):
		self.data = data
		self.next = next

class LinkedList(object):
	"""docstring for LinkedList"""
	
	head = None
	tail = None

	def addNode(self, data):
		if isinstance(data, Node):
			self.addNode(data.data)
			return
		node = Node(data)
		if self.head is None:
			self.head = self.tail = node
		else:
			self.tail.next = node
			self.tail = node

	def printNodes(self):
		node = self.head
		if node.next is None:
			print(node.data)
			return
		while node.next is not None:
			print(str(node.data) + "->", end = " ")
			node = node.next
		print(str(node.data))

	def deleteNode(self, data):
		delNode = Node(data)
		node = self.head
		if node.data == data:
			self.head = node.next
		while node.next is not None:
			if node.next.data == data:
				node.next = node.next.next
				return
			else:
				node = node.next

list = LinkedList()
list.addNode(1)
list.addNode(2)	
list.addNode(3)
list.addNode(4)
list.addNode(5)
list.printNodes()
list.deleteNode(3)
list.printNodes()


			
		
		