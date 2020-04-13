import csv
import datetime
from random import randint

with open('orders.csv', 'r') as orders:
    with open('order-list.csv', 'w') as olist:
        orders_csv = csv.reader(orders)
        for item in orders_csv:
            shipdate = datetime.datetime.fromisoformat(item[2]) + datetime.timedelta(days=3)

            bid = randint(0, 7044) % 248 + 2
            writer = csv.writer(olist)
            qty =  randint(1,4)
            writer.writerow([bid, item[1], qty, shipdate])





#base = datetime.datetime.today()
#
#with open('final-customers.csv', 'r') as customers:
#    with open('orders.csv', 'w') as orders:
#        customers_csv = csv.reader(customers)
#
#        dates = [base - datetime.timedelta(days=x) for x in range(7044)]
#        onum = 100
#        i = 0
#        for item in customers_csv:
#            writer = csv.writer(orders)
#            writer.writerow([item[0], onum, dates[i]])
#            onum+=1
#            i+=1
