#!/bin/bash

if [ $# -eq 0 ]; then
  echo "Error: Please provide a string as an argument."
  exit 1
fi

name="$1"
num=$(echo "$name" | cut -d '.' -f1)

link=$(echo "$name" | cut -d' ' -f2-)
link=$(echo "$link" | tr ' ' '-' | tr '[:upper:]' '[:lower:]')

folder_name="${folder_number}"

mkdir -p "$num"

if [ $? -eq 0 ]; then
  echo "Folder '$num' created successfully."
else
  echo "Error: Failed to create folder '$num'."
  exit 1
fi

echo "# [$name](https://leetcode.com/problems/$link)" >> "$num/README.md"
echo "" >> "$num/README.md"
echo "Topics:" >> "$num/README.md"
echo "" >> "$num/README.md"
echo "## Solution" >> "$num/README.md"
echo "" >> "$num/README.md"
echo "### Implementation" >> "$num/README.md"

echo "README.md file created in '$num'."

exit 0
