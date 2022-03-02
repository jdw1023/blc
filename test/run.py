import glob
from subprocess import PIPE, run, STDOUT

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
OPTIONS = '' # add blc options here
COLOR = True
for filename in glob.iglob('test/**/*.bl', recursive=True):
     print(f'./build/install/blc/bin/blc {OPTIONS} {filename}')
     output = run(f'./build/install/blc/bin/blc {OPTIONS} {filename}', shell=True, stdout=PIPE, stderr=STDOUT)
     output_text = output.stdout
     if output.returncode != 0 and COLOR:
          print(f'{bcolors.WARNING}{output_text.decode()}{bcolors.ENDC}', end='')
     else:
         print(output_text.decode())
