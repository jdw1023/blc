import glob
from subprocess import PIPE, run, STDOUT
from sys import argv

# https://stackoverflow.com/questions/287871/how-to-print-colored-text-to-the-terminal 
class bcolors:
    HEADER = '\033[95m'
    OKBLUE = '\033[94m'
    OKCYAN = '\033[96m'
    OKGREEN = '\033[92m'
    WARNING = '\033[93m'
    FAIL = '\033[91m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'

filenames = []
with open('test_for_extensions') as f:
    filenames = f.read().split('\n')

OPTIONS = ' '.join(argv[1:]) if len(argv) >1 else '' # add blc options here
COLOR = True
for filename in filenames:
    print(f'./build/install/blc/bin/blc {OPTIONS} {filename}')
    output = run(f'./build/install/blc/bin/blc {OPTIONS} {filename}', shell=True, stdout=PIPE, stderr=STDOUT)
    output_text = output.stdout
    if output.returncode != 0 and COLOR:
         print(f'{bcolors.WARNING}{output_text.decode()}{bcolors.ENDC}', end='')
    else:
         print(output_text.decode())
