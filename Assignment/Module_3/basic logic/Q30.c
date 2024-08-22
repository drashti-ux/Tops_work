// WAP to convert years into days and days into years
#include <stdio.h>

int main() {
    int choice;
    printf("Choose an option:\n");
    printf("1. Convert years to days\n");
    printf("2. Convert days to years\n");
    printf("Enter your choice (1 or 2): ");
    scanf("%d", &choice);

    if (choice == 1) {
        // Convert years to days
        int years;
        printf("Enter the number of years: ");
        scanf("%d", &years);

        // Assuming a non-leap year for simplicity
        int days = years * 365;
        printf("%d years is approximately %d days.\n", years, days);
    } else if (choice == 2) {
        // Convert days to years
        int days;
        printf("Enter the number of days: ");
        scanf("%d", &days);

        // Convert days to years (assuming a non-leap year)
        float years = days / 365.0;
        printf("%d days is approximately %.2f years.\n", days, years);
    } else {
        printf("Invalid choice. Please run the program again and choose 1 or 2.\n");
    }

    return 0;
}
