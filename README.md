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




(Add additional use cases as needed.)

---

## Minimal Viable Product (MVP)

| Team Member | MVP Use Case |
|-------------|--------------|
| Sheng-Chieh Huang | Use Case 1 |
| Shuhan Yuan | Use Case 2 |
| Shaorui Wu | Use Case 3 |

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
