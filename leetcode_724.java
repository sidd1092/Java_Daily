//@version=4
study("Custom Horizontal Lines", shorttitle="CHL", overlay=true)

// Input parameters
price = input(defval=100, title="Price", type=input.float)
degree = input(defval=0.25, title="Degree", type=input.float)
n = input(defval=10, title="Number of Lines", type=input.integer)

// Calculate the square root of the price and round it off
temp = round(sqrt(price))

// If the rounded value is even, add 1 to it
if (temp % 2 == 0)
    temp := temp + 1

// Draw horizontal lines
line.new(x1=bar_index - 100, y1=temp, x2=bar_index + 100, y2=temp, style=line.style_dotted, color=color.black, width=3)
for i = 1 to n
    line.new(x1=bar_index - 100, y1=temp + (i * degree), x2=bar_index + 100, y2=temp + (i * degree), color=color.green, width=1)
for i = 1 to n
    line.new(x1=bar_index - 100, y1=temp - (i * degree), x2=bar_index + 100, y2=temp - (i * degree), color=color.red, width=1)

// Draw labels
for i = 1 to n
    // Calculate the y-coordinate
    y_value = temp + (i * degree)
    
    // Calculate the label text as multiple of degree
    label_text = tostring(i * degree) + "°"
    
    // Add the label to the right side of the line
    label.new(
        x=bar_index + 110,          y=y_value,                  text=label_text,         color=color.black,         textcolor=color.white,         style=label.style_label_right    )
    
    // Calculate the y-coordinate for negative degree lines
    y_value_neg = temp - (i * degree)
    
    // Calculate the label text as multiple of degree
    label_text_neg = tostring(i * degree) + "°"
    
    // Add the label to the right side of the line
    label.new(        x=bar_index + 110,         y=y_value_neg,             text=label_text_neg,         color=color.black,         textcolor=color.white,         style=label.style_label_right    )