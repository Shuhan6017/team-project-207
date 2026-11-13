# Data Visualizor

## Team Information

### Team Members
- Sheng-Chieh Huang
- Shaorui Wu
- Shuhan Yuan
- Alexander Michael Abesteh

---

## Project Description

### Domain: Data Visualizer

A Data Analyses Visualizer that takes in .json or .csv files as input data, do some magic, and visualize it using the appropriate plots/graphs.

---

## User Stories

### As a user, I want to import data in .json or .csv files by dragging-and-dropping on to some workspace to begin analysing the data.

### As a user, I want to have different shapes and colour that represents certain categories to better understand my data.

### User Story 3, I want to save my cleaned dataset and charts so I can revisit or share my analysis later

### As a user, I want to filter my imported dataset based on specific conditions so that I can focus on relevant subsets of data during my analysis.

(Add additional user stories as needed.)

---

## Use Cases

### Use Case 1
Name: Import .json / .csv data.
Primary Actor: User importing their data.
Preconditions: 
- The user's data format follows our convention.
- The user's data file is of type .json or .csv.
Trigger: The user drags the file onto the workspace.
Success Outcome: The data is successfully parsed into a Map.
Main Success Scenario:
1. The user drags the file onto the workspace.
2. The system checks if the file is a .json or .csv file.
3. The system checks if the format is in our convention.
4. The system processes the data and parses them into a Map.
5. The system notifies the user the data is successfully parsed via a toast notification.
Extensions:
- 2a. File is flagged to not be a .json or .csv file.
i. The system notifies the user the data is in the wrong file type.
- 3a. File's format is flagged to not be in our convention.
i. The system notifies the user the data is in the wrong file type.


### Use Case 2
Name: Data Customization
Primary actor: User customizing data
Preconditions: data has been imported, data can be analyzed, information of customization has been give
trigger: the user ask the system to customize the data
success outcome: the visualization has colour and shapes for each different category like how the user asks
Main Success Scenario: 
1. The user has selects colour and shapes for different categories of the data (men(blue) vs women(red))
2. The system records the input and finds the different category
3. The system uses swift to change the output visualization of the data
4. The visualization includes the colour and shapes the user asks for

Extensions:
None


### Use Case 3
Name: Share analysis artifact
Primary actor:  Data analyst, stakeholder
Pre:
Trigger: The user have finished analyzing data and want to preserve or share current work.
Main success scenarios: 
1.The user asked to save or export for the data set
2.The system (transfer to some form e.g pdf....)
3. the system write the files to the chosen location
Extensions:
2a. The storage was unavailable
3a. The file name already exist


### Use Case 4

**Name:** Filter Dataset

**Primary Actor:** User filtering an imported dataset.

**Preconditions:**
- The user has successfully imported a dataset.
- The dataset contains at least one column that can be filtered.

**Trigger:** The user selects the option to filter the imported dataset.

**Success Outcome:** The system displays a filtered version of the dataset containing only rows that satisfy the user's specified filtering condition. The original dataset remains unchanged.

**Main Success Scenario:**
1. The user selects the option to filter the dataset.
2. The system displays the available columns in the imported dataset.
3. The user selects a column to filter.
4. The system displays the available filtering operators based on the selected column's data type.
5. The user selects a filtering operator and specifies a comparison value.
6. The user confirms the filtering condition.
7. The system validates the filtering condition and comparison value.
8. The system processes the dataset and selects all rows satisfying the filtering condition.
9. The system displays the resulting filtered dataset.
10. The system notifies the user that filtering was completed successfully.

**Extensions:**
**7a.** The comparison value is incompatible with the selected column's data type.

   i. The system notifies the user that the comparison value is invalid.

   ii. The user is prompted to enter a valid value.

**8a.** No rows satisfy the filtering condition.

   i. The system displays an empty filtered dataset.

   ii. The system notifies the user that no matching records were found.

**8b.** The filtering operation fails.

   i. The system notifies the user that filtering could not be completed.

   ii. The original dataset remains unchanged.

(Add additional use cases as needed.)

---

## Minimal Viable Product (MVP)

| Team Member | MVP Use Case |
|-------------|--------------|
| Sheng-Chieh Huang | Use Case 1 |
| Shuhan Yuan | Use Case 2 |
| Shaorui Wu | Use Case 3 |
| Alexander Abesteh | Use Case 4 |

---

## Entities

### Colour

### Shapes







---

## API Usage

**API Name:**

**Documentation:** [Link]

**How it is used in the program:**

---

## Design Diagrams

### UML Class Diagram


### Sequence Diagrams

---

## How to Run

[Instructions for running the program.]

---

## Notes

[Any additional project information.]
