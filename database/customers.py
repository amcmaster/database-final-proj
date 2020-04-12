import csv
from random import randint

def rand_int_with(n):
    range_start = 10**(n-1)
    range_end = (10**n)-1
    return randint(range_start, range_end)
phones_generated = {}
#with open('customers.csv', 'r') as customers:
#   with open('names.tsv', 'r') as names:
#        with open('bike_customers.csv', 'w') as bike_customers:
#            cus_csv = csv.reader(customers)
#            names_tsv = csv.reader(names, delimiter='\t')
#            nm = []
#            cus_id = [__[0] for __ in cus_csv]
#
#            i = 0
#            for name in names_tsv:
#                if i == len(cus_id):
#                    break
#                nm.append(name[1])
#                i+=1
#
#            for name, cus in zip(nm, cus_id):
#                writer = csv.writer(bike_customers)
#                writer.writerow([cus, name])
#

with open('bike_customers.csv', 'r') as bike_customers:
    with open('addr.csv', 'r') as addrs:
        with open('final-customers.csv', 'w') as customers_final:
            addrs_csv = csv.reader(addrs)
            bike_customers_csv = csv.reader(bike_customers)

            addr = []
            i = 0
            for item in addrs_csv:
                if(i == 7044):
                    break
                address = item[2]+' '+ item[3]+' '+item[5]+' '+item[7]+' '+item[8]


                if len(address.strip()) == 0:
                    continue
                else:
                    addr.append(address)

                i+=1

            i = 0
            for item in bike_customers_csv:
                writer = csv.writer(customers_final)
                phone = rand_int_with(10)
                while phone in phones_generated:
                    phone = rand_int_with(10)

                if(i == 0):
                    phone = 'Phone'
                    addr[i] = 'Address'

                writer.writerow([item[0], item[1], phone, addr[i]])
                i+=1
