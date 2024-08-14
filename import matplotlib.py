import matplotlib.pyplot as plt

# Data
years = [2017, 2018, 2019, 2020, 2021, 2022]
male_enrollees = [1350, 1200, 1505, 1423, 985, 1625]
female_enrollees = [1260, 1001, 923, 832, 1123, 1357]

# Create the plot
plt.figure(figsize=(10, 6))

# Plot male enrollees
plt.plot(years, male_enrollees, marker='o', linestyle='-', color='b', label='Male Enrollees')

# Plot female enrollees
plt.plot(years, female_enrollees, marker='o', linestyle='-', color='r', label='Female Enrollees')

# Adding titles and labels
plt.title('Enrolment Trends by Gender (2017-2022)')
plt.xlabel('Year')
plt.ylabel('Number of Enrollees')
plt.xticks(years)  # Set x-axis ticks to be each year

# Adding legend
plt.legend()

# Display the plot
plt.grid(True)  # Add grid for better readability
plt.tight_layout()  # Adjust layout to make room for the labels and title
plt.show()