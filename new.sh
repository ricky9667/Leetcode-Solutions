#!/bin/bash

# Check if a number argument is provided
if [ $# -eq 0 ]; then
  echo "Error: Please provide a number as an argument."
  exit 1
fi

# Get the folder number from the argument
folder_number="$1"

# Create the folder name with the number
folder_name="${folder_number}"

# Create the folder with mkdir -p (creates parent directories if needed)
mkdir -p "$folder_name"

# Check if folder creation was successful
if [ $? -eq 0 ]; then
  echo "Folder '$folder_name' created successfully."
else
  echo "Error: Failed to create folder '$folder_name'."
  exit 1
fi

# Create an empty README.md file
touch "$folder_name/README.md"

echo "README.md file created in '$folder_name'."

exit 0

