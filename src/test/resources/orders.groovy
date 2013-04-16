def orders = [
	[orderID:'12',firstName:'Ken',lastName:'Yagen',address:'75 Geary St, San Francisco, CA 94062',itemManufacturer:'Philips',itemName:'i-2',itemProductID:'12345',itemQuantity:'40'],
	[orderID:'12',firstName:'Ken',lastName:'Yagen',address:'75 Geary St, San Francisco, CA 94062',itemManufacturer:'Samsung',itemName:'s-23',itemProductID:'22234',itemQuantity:'10'],
]
def out = new File('orders.csv')
orders.each {
    def row = [it.orderID, it.firstName, it.lastName, it.address, it.itemManufacturer, it.itemName, it.itemProductID, it.itemQuantity]
    out.append row.join(',')
    out.append '\n'
}
