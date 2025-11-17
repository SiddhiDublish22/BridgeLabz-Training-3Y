// Q2: Multi-Type Data Summary

// Various data types
let userName = "Siddhi";           // String
let age = 22;                       // Number
let isMember = true;                // Boolean
let hobbies = ["reading", "coding"]; // Array
let profile = { id: 1, role: "admin" }; // Object
let middleName = null;              // Null
let lastLogin;                       // Undefined

// Array of data entries
let dataEntries = [
    { label: "User Name", value: userName, type: typeof userName },
    { label: "Age", value: age, type: typeof age },
    { label: "Is Member", value: isMember, type: typeof isMember },
    { label: "Hobbies", value: hobbies, type: Array.isArray(hobbies) ? "array" : typeof hobbies },
    { label: "Profile", value: profile, type: typeof profile },
    { label: "Middle Name", value: middleName, type: typeof middleName },
    { label: "Last Login", value: lastLogin, type: typeof lastLogin }
];

// Print report
console.table(dataEntries);
