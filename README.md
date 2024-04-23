# From Illusions to Solutions: A Deep Dive into the Hallucinations of LLM-Generated API Recommendations


### Requirements

- We used the Python version 3.12.1 and it is recommended to use the same version.
- Conda or python virtual environment is preferred.
- Preferred operating system: Linux/macOS/Windows-WSL
- Need to install required Python libraries from [requirements.txt](requirements.txt).

### Setup & Installation

```bash
# Clone or download the repository and navigate to the root directory

# Create a new conda environment
conda create --name myenv python=3.12.1  # Change 'myenv' to your desired conda environment name.

# Activate the conda environment
conda activate myenv  # Change 'myenv' to the name you set in the previous step.

# Install the required packages
conda install --file requirements.txt

# If some packages are not available in Conda, install with pip after activating the conda environment:
# pip install -r requirements.txt

# Launch Jupyter notebook
jupyter notebook
```

### Usage
- To run the code (without RAG) go to the notebook called [Hallucination_with_Magicoder.ipynb](Hallucination_with_Magicoder.ipynb).

- To run with RAG, go to the [RAG](RAG) folder and run the [RAG_with_Magicoder.ipynb](RAG/RAG_with_Magicoder.ipynb) notebook.