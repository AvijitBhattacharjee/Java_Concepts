#!/bin/bash

current_year=$(date +"%Y")
missing_copyright=false

for file in $(find . -name "*.java"); do
  if ! grep -q "^\/\/ Copyright (c) avijit bhattacharjee $current_year" "$file"; then
    echo "File $file is missing copyright comment"
    missing_copyright=true
  fi
done

if [ "$missing_copyright" = true ]; then
  exit 1
fi
