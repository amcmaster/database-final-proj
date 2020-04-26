import csv

with open('final-customers.csv', 'r') as customers:
    with open('customer-fixed.csv', 'w') as fixed:
        customer_csv = csv.reader(customers)

        for item in customer_csv:
            writer = csv.writer(fixed)
            name = item[1]
            if len(name.split()) < 2:
                continue
            fname, lname = name.split(maxsplit=1)
            writer.writerow([item[0], fname, lname, item[2]])



