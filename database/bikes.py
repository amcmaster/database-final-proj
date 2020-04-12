import csv

with open('bike-data.csv','r') as bike_data:
    with open('bikes.csv', 'w') as bikes:
        with open('brands.csv', 'w') as brands:
            bike_csv = csv.reader(bike_data)

            for item in bike_csv:
                bike_writer = csv.writer(bikes)
                brand_writer = csv.writer(brands)
                bike_writer.writerow([item[0], item[1], item[3], item[4],
                    item[5], item[6]])

                brand_writer.writerow([item[0], item[1], item[2]])
