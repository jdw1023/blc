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


# TODO: better testing using some framework (junit?)
OPTIONS = ' '.join(argv[1:]) if len(argv) >1 else '' # add blc options here
COLOR = True
for filename in glob.iglob('**/*.bl', root_dir='test', recursive=True):
     print(f'./build/install/blc/bin/blc {OPTIONS} {filename}')
     output = run(f'../build/install/blc/bin/blc {OPTIONS} {filename}', shell=True, cwd='test', stdout=PIPE, stderr=STDOUT)
     output_text = output.stdout
     if output.returncode != 0 and COLOR:
          print(f'{bcolors.WARNING}{output_text.decode()}{bcolors.ENDC}', end='')
     else:
         print(output_text.decode())
